public class CardDeck {
    String shape = "Diamond";
    int i = 0;
    int j = 0;
    int NumberOfCard1 = (int) Math.floor(Math.random() * 9) + 2;
    int NumberOfCard2 = (int) Math.floor(Math.random() * 9) + 2;
    int NumberOfCard3 = (int) Math.floor(Math.random() * 9) + 2;
    int[] cardArr = new int[]{NumberOfCard1, NumberOfCard2, NumberOfCard3};
    void deal() {
        System.out.printf("카드의 모양은 %s이고, 카드의 숫자는 %d 입니다.\n", shape, cardArr[i]);
        i++;
    }

    void remain_cards(){
        System.out.printf("카드 덱에는 %d장의 카드가 남아있습니다.\n",3-j);
        j++;
    }

    public static void main(String[] args) {
        CardDeck turn = new CardDeck();
        turn.remain_cards();
        turn.deal();
        turn.remain_cards();
        turn.deal();
        turn.remain_cards();
        turn.deal();
        turn.remain_cards();
    }
}

