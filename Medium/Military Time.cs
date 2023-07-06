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
            String input
              = Console.ReadLine();
            String[] time12
              = input.Split(" ");
            String[] time12hm
              = time12[0].Split(":");
            int h = Convert.ToInt32(
                      time12hm[0]);
                    
            if (time12[1] == "AM") {
                if (h == 12) h = 0;
            } else {
                h += 12;
            }
            
            String sh
              = Convert.ToString(h);
            if (sh.Length == 1) {
                sh = "0" + sh;
            }
            
            String time24
              = sh + ":" + time12hm[1];
            Console.WriteLine(time24);
        }
    }
}