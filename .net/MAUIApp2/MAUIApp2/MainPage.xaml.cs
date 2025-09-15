namespace MauiApp2
{
    public partial class MainPage : ContentPage
    {
        bool img1Clicked = false;
        bool img2Clicked = false;

        public MainPage()
        {
            InitializeComponent();
        }

        private void OnClicked1(object sender, EventArgs e)
        {
            if (!img1Clicked)
            {
                Img1.Source = "Phase2reality.png"; // ✅ change to your "reality" image
                Lbl1.Text = "Reality";
                img1Clicked = true;
            }
            else
            {
                Img1.Source = "Phase2withoutcontrast.png"; // back to expectation
                Lbl1.Text = "Expectation";
                img1Clicked = false;
            }
        }

        private void OnClicked2(object sender, EventArgs e)
        {
            if (!img2Clicked)
            {
                Img2.Source = "Altered5reality.png"; // ✅ change to your "reality" image
                Lbl2.Text = "Reality";
                img2Clicked = true;
            }
            else
            {
                Img2.Source = "Altered5.png"; // back to expectation
                Lbl2.Text = "Expectation";
                img2Clicked = false;
            }
        }
    }
}
