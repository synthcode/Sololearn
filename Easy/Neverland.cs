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
            int myAge = Convert.ToInt32(input);
            
            input = Console.ReadLine();
            int yearsPassed = Convert.ToInt32(input);
            
            Console.WriteLine("My twin is {0} years old and they are {1} years older than me", myAge + yearsPassed, yearsPassed);
        }
    }
}