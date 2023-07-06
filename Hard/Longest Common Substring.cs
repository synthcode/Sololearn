using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sololearn
{
  class Program
  {
    static List<string> subFunc(
      List<string> minList,
        int subLength)
    {
      List<string> subList
        = new List<string>();
      
      int count = minList.Count;
      if (count == 0) {
        return subList;
      }
      
      int maxLength = minList[0].Length;
      if (subLength > maxLength) {
        return subList;
      }
      
      for (int i = 0; i < count; ++i) {
        string word = minList[i];
        for (int j = subLength;
               j <= maxLength; ++j) {
          string sub = word.Substring(
            j - subLength, subLength);
          subList.Add(sub);
        }
      }

      return subList;
    }
  
    static void Main(string[] args)
    {
      string input = Console.ReadLine();
      string[] words = input.Split();
      Array.Sort(words, (x, y)
        => x.Length.CompareTo(
           y.Length));
        
      int minLength = words[0].Length;
      List<string> minList
        = new List<string>();
        
      foreach (string word in words) {
        int length = word.Length;
        if (length == minLength) {
          minList.Add(word);
        }
      }
              
      List<string> subList
        = new List<string>();
      List<string> longestSubs
        = new List<string>();
        
      for (int k = minLength;
             k > 0; --k) {
        subList = subFunc(minList, k);
        
        foreach (string sub
                   in subList) {
          bool contains = true;
          foreach (string word
                     in words) {
            if (!word.Contains(sub)) {
                contains = false;
            }
          }
          if (contains) {
            longestSubs.Add(sub);
          }
        }
          
        if (longestSubs.Count != 0) {
          break;
        }
      }
      
      string[] output
        = longestSubs.ToArray();
      Array.Sort(output);
      if (output.Length != 0) {
        Console.WriteLine(output[0]);
      }
    }
  }
}