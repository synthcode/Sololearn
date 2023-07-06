using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sololearn
{
    class Program
    {
        static void Main(string[] args)
        {
            float cyan
              = Convert.ToSingle(
                  Console.ReadLine());
            float magenta
              = Convert.ToSingle(
                  Console.ReadLine());
            float yellow
              = Convert.ToSingle(
                  Console.ReadLine());
            float black
              = Convert.ToSingle(
                  Console.ReadLine());
            
            int red
              = Convert.ToInt32(
                  255.0 * (1.0 - cyan)
                    * (1.0 - black));
            int green
              = Convert.ToInt32(
                  255.0 * (1.0 - magenta)
                    * (1.0 - black));
            int blue
              = Convert.ToInt32(
                  255.0 * (1.0 - yellow)
                    * (1.0 - black));
                    
            Console.WriteLine(
              Convert.ToString(red)
                + ',' +
              Convert.ToString(green)
                + ',' +
              Convert.ToString(blue));
        }
    }
}