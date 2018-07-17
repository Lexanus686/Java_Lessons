package Lesson2_2;

public enum DaysOfWeek {

    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(8), Saturday(0), Sunday(0);
    private int hours;
    DaysOfWeek(int hours) {
        this.hours = hours;
    }
    public int getHours(DaysOfWeek current)
    {
        return current.hours;
    }
}

class MainEnum{
    public static void main(String[] args) {
        int res = getWorkingHours(DaysOfWeek.Sunday);
        if (res == 0) System.out.println("Выходной"); else System.out.println(res);
    }

    public static int getWorkingHours(DaysOfWeek current){
        int summary = 0;
        for (DaysOfWeek o : DaysOfWeek.values())
        {
            if (o.ordinal() >= current.ordinal()) summary += o.getHours(o);
        }
        return summary;
    }
}
