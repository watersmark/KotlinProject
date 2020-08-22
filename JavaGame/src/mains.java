class Gameplay{
    private int mass_hard;
    private int length_area = 7;
    private int[] enemy_pos;

    public void mass_step(int step){
        this.mass_hard = step;
    }

    public void area_length(int length){
        this.length_area = length;
    }

    public int[] generate_enemy(){
        int first_digit = (int) (Math.random() * (length_area - (mass_hard - 1)));

        this.enemy_pos = new int[mass_hard];

        for(int i = 0; i < mass_hard; i++){
            enemy_pos[i] = first_digit + i;
        }

        return enemy_pos;
    }

    public String fight(int shorts){

        for(int digit_short: this.enemy_pos){
            if (shorts == digit_short){
                return "Попал";
            }

        }
        return "Мимо";

    }

}

class Player{

}


public class mains {
    public static void main(String[] args) {

        Gameplay test = new Gameplay();
        test.mass_step(5);
        test.area_length(10);

        int[] temp1 =  test.generate_enemy();
        for(int i : temp1){
            System.out.println(i);
        }


        System.out.println(test.fight(7));
    }
}
