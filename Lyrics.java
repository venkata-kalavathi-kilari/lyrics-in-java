package song;
public class Lyrics{
    public static void main(String[] args) {

        System.out.println("=== Made By Epik 🎵🥁😄===");
        String[] lirik = {
            "Jump in,",
            "the deep end,",
            "tryna swim but you're sinking,",
            "I Don't know",
            "The reason,",
            "just needed something different,",
            "Don't gotta hear what they're speaking,",
            "NO No,",
            "Don't gotta take what they Giving,",
            "remember the meaning,",
            "the old folks we'll be singing,",
            "[music...] oh hooo...",
            "(Imma raise my arms high)",
            "[music...]oh hooo",
            "(Imma touch the skyline)",
            "[music...]oh hoo",
            "Imma sing it aloud like",
            "[music...]oh hoo",
            "Let me,",
            "be free",
            "pallivaalu bhadravattakam,",
            "Kayyilentum thampuratti,",
            "Nallacchante thirumumpi chennu kali,",
            "Kali thudangi,",
            "anganangane",
            "pallivaalu bhadravattakam,",
            "Kayyilentum thampuratti,",
            "Nallacchante thirumumpi chennu kali,",
            "Kali thudangi,",
            "Pallivaalu",
            "pallivaalu",
            "Pallivaalu",
            "pallivaalu",
            "anganangane",
            "Pallivaalu",
            "pallivaalu",
            "Let me,",
            "be free......",
       };

        int[] delays = {
            1000, 1000, 300, 400, 600,
            500, 400, 500, 400, 900,
            500,2700,500,2700,500,
            2700,500,2000,500,500,
            1000,1000,1000,900,1500,
            500,500,500,2000 ,
            500,1000,500,1000,500,
            500,1000,500,1500
        };

        for (int i = 0; i < lirik.length; i++) {
            String line = lirik[i];

            for (char c : line.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();

            try {
                Thread.sleep(delays[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}
