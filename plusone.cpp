// A number is input in computer then a new no should get printed by adding one to each of its digit.
// If you encounter a 9, insert a 10 (don't carry over, just shift things around).
// For example, 998 becomes 10109.
#include <iostream>
using namespace std;

int main()
{
  //int number = 10;
  //int number = 998;
  //int number = 1010;
  int number = 10109;

  if ((number < 10) && (number > 0))
    {
      cout << (number+1) << endl;
    }

  else if (number >= 10)
    {
      int counter = 0;
      int newNumber = 0;
      
      while (number > 0)
	{
	  int modNumber = number%10;
	  number = number /10;
	  
	  modNumber++;

	  if (counter == 0)
	    {
 
	      newNumber = modNumber;
	      if (newNumber == 10)
		{
		  counter = 10; 
		}
	      else
		{
		  counter = counter + 1;
		}
	    }

	  else
	    {
	      newNumber = newNumber + modNumber*10*counter;

	      if (modNumber != 10)
		{
		  counter = counter*10;
		}
	      
	      if (modNumber == 10)
		{
		  counter = counter * 100;
		}
	    }

	}

      cout << newNumber << endl;
    }

  return 0;
}
