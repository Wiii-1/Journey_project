namespace MauiApp2._0
{
    public partial class MainPage : ContentPage
    {
        bool isReality = false;

        public MainPage()
        {
            InitializeComponent();
        }

        private void OnClicked(object sender, EventArgs e)
        {
            if (!isReality)
            {

                Img1.Source = "the_reality.jpg";
                Lbl1.Text = "Reality";

                Img2.Source = "altered5.png";
                Lbl2.Text = "Reality";

                isReality = true;
            }
            else
            {

                Img1.Source = "maxresdefault.jpg";
                Lbl1.Text = "Expectation";

                Img2.Source = "phase2withoutcontrast.png";
                Lbl2.Text = "Expectation";

                isReality = false;
            }
        }
    }
}
