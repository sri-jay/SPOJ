#include <iostream>

using namespace std;

int main()
{
	int ip;
	while(true)
	{
		cin >> ip;
		if(ip != 42)
			cout << ip << endl;
		else
			break;
	}
	return 0;
}