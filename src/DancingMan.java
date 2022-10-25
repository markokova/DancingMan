public class DancingMan {

    private String[][] figure;
    private boolean turned;

    DancingMan(){
        figure = new String[3][3];
        turned = false;
        createASkeleton();
    }

    public void say(String words){
        StringBuilder builder = new StringBuilder(words);
        words = builder.substring(3);
        System.out.println(words);
    }

    public void turn(){
        if(turned == false) turned = true;
        else turned = false;
    }

    public void dance(String command){
        if (command.equals("left hand to head")) {
            if(turned == false){
                this.figure[0][2] = ")";
                this.figure[1][2] = " ";
            }
            else{
                this.figure[0][0] = "(";
                this.figure[1][0] = " ";
            }
            draw();
        } else if (command.equals("left hand to hip")) {
            if(turned == false){
                this.figure[1][2] = ">";
                this.figure[0][2] = " ";
            }
            else{
                this.figure[1][0] = "<";
                this.figure[0][0] = " ";
            }
            draw();
        } else if (command.equals("left hand to start")) {
            if(turned == false){
                this.figure[1][2] = "\\";
                this.figure[0][2] = " ";
            }
            else{
                this.figure[1][0] = "/";
                this.figure[0][0] = " ";
            }
            draw();
        } else if (command.equals("right hand to hip")) {
            if(turned == false){
                this.figure[1][0] = "<";
                this.figure[0][0] = " ";
            }
            else{
                this.figure[1][2] = ">";
                this.figure[0][2] = " ";
            }
            draw();
        } else if (command.equals("right hand to head")) {
            if(turned == false){
                this.figure[0][0] = "(";
                this.figure[1][0] = " ";
            }
            else{
                this.figure[0][2] = ")";
                this.figure[1][2] = " ";
            }
            draw();
        } else if (command.equals("right hand to start")) {
            if(turned == false){
                this.figure[1][0] = "/";
                this.figure[0][0] = " ";
            }
            else{
                this.figure[1][2] = "\\";
                this.figure[0][2] = " ";
            }
            draw();
        } else if (command.equals("left leg out")) {
            if(turned == false){
                this.figure[2][2] = "\\";
            }
            else{
                this.figure[2][0] = "/";
            }
            draw();
        } else if (command.equals("left leg in")) {
            if(this.figure[2][0].equals("/")){
                if(turned == false){
                    this.figure[2][2] = ">";
                }
                else{
                    if(this.figure[2][2] == "\\")
                        this.figure[2][0] = "<";
                }
            }
            draw();
        } else if (command.equals("right leg out")) {
            if(turned == false){
                this.figure[2][0] = "/";
            }
            else{
                this.figure[2][2] = "\\";
            }
            draw();
        } else if (command.equals("right leg in")) {
            if(this.figure[2][2].equals("\\")) {
                if(turned == false){
                    this.figure[2][0] = "<";
                }
                else{
                    if(this.figure[2][0] == "/")
                    this.figure[2][2] = ">";
                }
            }
            draw();
        }
        //else System.out.println("Wrong input.");
    }

    private void draw(){
        for(int index = 0; index < 3; index++){
            for(int jindex = 0; jindex < 3; jindex++){
                System.out.print(this.figure[index][jindex]);
            }
            System.out.println();
        }
    }

    private void createASkeleton(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.figure[i][j] = " ";
            }
        }
        this.figure[0][1] = "O";
        this.figure[1][1] = "|";
        this.figure[1][0] = "/";
        this.figure[1][2] = "\\";
        this.figure[2][0] = "/";
        this.figure[2][2] = "\\";
    }
}
