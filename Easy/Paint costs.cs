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
            string input = Console.ReadLine();
            float colours = Convert.ToSingle(input);
            float cost = (colours * 5.00f + 40.00f) * 1.1f;
            Console.WriteLine(Math.Ceiling(cost));
        }
    }
}