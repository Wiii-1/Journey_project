using System.Formats.Tar;

namespace SRF_Mariano
{
    public partial class MainPage : ContentPage
    {
        private string photoPath;

        public MainPage()
        {
            InitializeComponent();
        }

        private async void OnUploadPhotoClicked(object sender, EventArgs e)
        {
            var result = await FilePicker.PickAsync(new PickOptions
            {
                PickerTitle = "Select a picture",
                FileTypes = FilePickerFileType.Images
            });

            if (result != null)
            {
                photoPath = result.FullPath;
                using var stream = await result.OpenReadAsync();
                //UserPhoto.Source = ImageSource.FromStream(() => stream);
            }
        }

        private async void OnRegisterClicked(object sender, EventArgs e)
        {
            // Text entries
            string rollNo = RollNo.Text;
            string firstName = Firstname.Text;
            string lastName = Lastname.Text;
            string father = Father.Text;
            string mother = Mother.Text;
            string day = Day.Text;
            string month = Month.Text;
            string year = Year.Text;
            string email = Emailadd.Text;
            string password = Password.Text;
            string city = City.Text;
            string address = Address.Text;

            // Picker (dropdowns)
            string mobileCode = (string)CountryCode.SelectedItem;
            string mobileNumber = MobileEntry.Text;
            string course = (string)CoursePicker.SelectedItem;

            // Radio buttons
            string gender = MR.IsChecked ? "Male" :
                            MRS.IsChecked ? "Female" : "Not Selected";

            // Checkboxes
            List<string> departments = new();
            if (CSE.IsChecked) departments.Add("CSE");
            if (IT.IsChecked) departments.Add("IT");
            if (ECE.IsChecked) departments.Add("ECE");
            if (Civil.IsChecked) departments.Add("Civil");
            if (Mech.IsChecked) departments.Add("Mech");

            // Build a message
            string message =
                "You're now registered\n" +
                $"Roll No: {rollNo}\n" +
                $"Name: {firstName} {lastName}\n" +
                $"Departments: {string.Join(", ", departments)}\n" +
                $"Course: {course}\n"
                ;

            await DisplayAlert("Form Submitted", message, "OK");
        }

        

    }
}
