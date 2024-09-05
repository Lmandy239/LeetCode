boolean solution(String inputString) {
char[] mainArray = inputString.toCharArray();
char[] temp = new char[mainArray.length];
int j = temp.length - 1;
    
for(int i = 0; i < mainArray.length; i++){
    temp[j] = mainArray[i];
    j = j - 1;
}

for(int i = 0; i < temp.length; i++){
    if(temp[i] != mainArray[i]){
        return false;
    }
}


return true;
}





