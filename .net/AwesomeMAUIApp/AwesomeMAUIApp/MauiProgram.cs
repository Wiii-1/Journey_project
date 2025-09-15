using Microsoft.Extensions.Logging;

namespace AwesomeMAUIApp
{
    public static class MauiProgram
    {
        public static MauiApp CreateMauiApp()
        {
            var builder = MauiApp.CreateBuilder();
            builder
                .UseMauiApp<App>()
                .ConfigureFonts(fonts =>
                {
                    fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
                    fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
                });

                
            

            return builder.Build();
        }


        public static void OnEntryTextChanged(object sender, TextChangedEventArgs e)
        {
            
        }
    }
}
