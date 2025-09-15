namespace MAUIApp3
{
    public partial class MainPage : ContentPage
    {
        int count = 0;

        public MainPage()
        {
            InitializeComponent();
        }

        private async void OnDial(object sender, EventArgs e) {
            try {
                var number = PhoneNum?.Text?.Trim();
                if (string.IsNullOrWhiteSpace(number))
                    throw new ArgumentException("Empty");

                if (!number.All(char.IsDigit))
                    throw new ArgumentException("non-numeric");

                PhoneDialer.Open(PhoneNum.Text);
                
            }
            catch {
                await DisplayAlert("Invalid Input", "Please enter a valid phone number", "Ok");

            }
        }
    }
}
