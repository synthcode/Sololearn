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
      const int kids = 15;
      int leftover = 0;
      for (int i = 0; i < 4; ++i) {
        int colour = Convert.ToInt32(
          Console.ReadLine());
        leftover += colour % kids;
      }
      
      Console.WriteLine(leftover);
    }
  }
}