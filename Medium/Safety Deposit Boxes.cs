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
           string s = Console.ReadLine();
           string r = Console.ReadLine();
           string[] items = s.Split(',');
           
           int time = 0;
           foreach (string i in items)
           {
               time += 5;
               if (i.Equals(r)) break;
           }
           
           Console.WriteLine(time);
        }
    }
}