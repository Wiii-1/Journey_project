#include <iostream>
using namespace std;

int main(){
    int number1;
    int number2;
    int operation;
    
    cout << "Enter A number: ";
    cin >> number1;
    cout << "Enter another number:";
    cin >> number2;
    cout << "1. + for addition 2. - for subtraction \n\n3. * for multiplication 4. / division\n\n" << endl;
    cout << "pick an operation to perform:" << endl;
    cin >> operation;

   switch (operation)
   {
    case 1: 
        cout << number1 + number2 << endl;
        break;
    case 2: 
        cout << number1 - number2 << endl;
        break;
    case 3:
        cout << number1 * number2 << endl;
        break;
    case 4: 
        cout << number1 / number2 << endl;
        break;
    default:
        cout << "invalid operative" << endl;
   }
   return 0;
};
