class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (0 < dot[0] && 0 < dot[1]) answer = 1;
        else if (0 > dot[0] && 0 < dot[1]) answer = 2;
        else if (0 < dot[0] && 0 > dot[1]) answer = 4;
        else answer = 3;
        
        return answer;
    }
}