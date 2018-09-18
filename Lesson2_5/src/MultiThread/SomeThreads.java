package MultiThread;

public class SomeThreads {
    private static final int size = 10000000;
    static final int h = size / 2;


    static void oneThread() {
        float[] arr = new float[size]; //1
        for (int i = 0; i < size; i++) arr[i] = 1; //2
        long a = System.currentTimeMillis(); //3
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < size; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
                }
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.currentTimeMillis(); //5
        System.out.println(System.currentTimeMillis() - a); //6
    }




    static void SeveralThreads() {
        float[] arr = new float[size];
        int hLocal = 2;
        int sizeLocal = size/hLocal;
        for (int i = 0; i < size; i++) arr[i] = 1;
        long a = System.currentTimeMillis();

        float[][] aList = new float[hLocal][1];
        for (int i = 0; i < hLocal; i++)
        {
            aList[i] = new float[sizeLocal];
            System.arraycopy(arr, i*sizeLocal, aList[i], 0, sizeLocal);
        }

        Thread[] tLocal = new Thread[hLocal];
        for (int i = 0; i < hLocal; i++) {
            int finalI = i;
            tLocal[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < sizeLocal; j++){
                        aList[finalI][j] = (float)(aList[finalI][j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) *
                                Math.cos(0.4f + j / 2));
                    }
                }
            });
        }

        for (int i = 0; i < hLocal; i++)
            tLocal[i].start();

        for (int i = 0; i < hLocal; i++)
            try {
                tLocal[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        for (int i = 0; i < hLocal; i++)
            System.arraycopy(aList[i], 0, arr, i*sizeLocal, sizeLocal);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void main(String[] args) {
        oneThread();

        SeveralThreads();
    }
}
