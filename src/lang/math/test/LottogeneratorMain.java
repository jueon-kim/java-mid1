package lang.math.test;

public class LottogeneratorMain {

    public static void main(String[] args) {
        LottoGenerrator generrator = new LottoGenerrator();
        int[] lottoNumbers = generrator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
