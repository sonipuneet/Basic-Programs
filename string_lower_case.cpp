/*
Author - Puneet Soni
*/
#include <iostream>

class Solution {
public:
    string toLowerCase(string str) {
        auto text = str;
        for (auto i = 0; i < str.length(); ++ i) { // Loop will run for the length of the input string
            if (text[i] >= 'A' && text[i] <= 'Z') {
                text[i] += 32;
            } 
        }
        return text;
        cout<< "Enter the value for the string : "; 
        cin >> str; // Enter the value for the string
    }
};