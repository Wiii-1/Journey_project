using System;
using Microsoft.Maui;
using Microsoft.Maui.Hosting;

namespace Student_Registration_Form_Mariano_Wesley_R._BSCS_501
{
    internal class Program : MauiApplication
    {
        protected override MauiApp CreateMauiApp() => MauiProgram.CreateMauiApp();

        static void Main(string[] args)
        {
            var app = new Program();
            app.Run(args);
        }
    }
}
