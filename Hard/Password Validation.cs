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
            bool strength = false;
            var digits
              = new HashSet<char> {
                '0', '1', '2', '3',
                '4', '5', '6', '7',
                '8', '9'
            };
            var specials
              = new HashSet<char> {
                '!', '@', '#', '$',
                '%', '&', '*'
            };
            
            string password
              = Console.ReadLine();
            
            int digitCount = 0;
            int specialCount = 0;
            foreach (char c
                       in password) {
                if (digits.
                    Contains(c)) {
                    ++digitCount;
                }
                else if (specials.
                         Contains(c)) {
                    ++specialCount;
                }        
            }
              
            if (password.Length >= 7
                  && digitCount >= 2
                  && specialCount >= 2) {
                strength = true;
            }
            
            if (strength) {
                Console.WriteLine(
                  "Strong");
            } else {
                Console.WriteLine(
                  "Weak");
            }
        }
    }
}