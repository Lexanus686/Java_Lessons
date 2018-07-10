package Lesson2_1.Marathon;

class Team{
    private String name;
    private Competitor[] competitors = new Competitor[4];
    Team(String name, Competitor one, Competitor two, Competitor three, Competitor four){
        this.name = name;
        competitors[0] = one;
        competitors[1] = two;
        competitors[2] = three;
        competitors[3] = four;
    }
    Competitor getter(int i){
        return competitors[i];
    }
    /*void showResults(){
        for (Competitor c: competitors) {
            c.info();
        }
    }*/
    void showSuccessResults(){
        for (Competitor c: competitors) {
            if (c.isOnDistance()) c.info();
        }
    }

    void showAllResults() {
        for (Competitor c: competitors) {
            c.infoAboutBuffer();
            c.info();
        }
    }
}
