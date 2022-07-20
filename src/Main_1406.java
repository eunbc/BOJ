import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main_1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i< str.length(); i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator();

        //커서를 맨 뒤로 이동시킴
        while(iterator.hasNext()) {
            iterator.next();
        }

        for(int i=0; i<n; i++) {
            String command = sc.next();
            switch(command.charAt(0)) {
                case 'L':
                    if(iterator.hasPrevious()) iterator.previous();
                    break;
                case 'D':
                    if(iterator.hasNext()) iterator.next();
                    break;
                case 'B':
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    iterator.add(sc.next().charAt(0));
                    break;
                default:
                    break;
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
