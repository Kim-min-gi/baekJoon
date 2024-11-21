class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int healthMax = health;
        int count = attacks[attacks.length-1][0];
        int seq = -1;
        int attackTime = 0;
        
        for (int i =0; i<=count; i++){
            //몬스터 공격 체크
            if (attacks[attackTime][0] == i){
                health -= attacks[attackTime][1];

                //체력 확인 후 리턴
                if (health <= 0) {
                    return -1;
                }

                seq = 0;
                attackTime++;

            }else{
                seq++;
                
                //연속 성공 체크
                if (seq == bandage[0]) {
                    health += bandage[2];
                    seq = 0;
                }

                //체력 최대치 확인
                if (healthMax > health) {
                    health += bandage[1];
                } 
                
                if(health > healthMax) health = healthMax;

            }

        }
    
        
        return health;
    }
}