int solution(int[] inputArray) {
int max = Integer.MIN_VALUE;
int product = 0;
for(int i = 0; i < inputArray.length - 1; i++){
    product = inputArray[i] * inputArray[i + 1];

if(product > max){
    max = product;
}

}

return max;
}
