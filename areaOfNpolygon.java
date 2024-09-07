int solution(int n) {
int answer = 0;


if(n == 0){
    answer = 0;
    }
else if(n == 1){
    answer = 1;
    }
else{
   answer = n * n + (n-1) * (n-1);
}


return answer;
}
