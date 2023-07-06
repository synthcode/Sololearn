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
            DateTime date
              = DateTime.Parse(input);
            Console.WriteLine(
              date.DayOfWeek);
        }
    }
}