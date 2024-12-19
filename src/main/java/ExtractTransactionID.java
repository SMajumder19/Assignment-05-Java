//Task: 13

public class ExtractTransactionID {
    public static void main(String[] args){
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        //System.out.println(html);
        String txnID = findTxnID(html);
        System.out.println("Transaction Id: " + txnID);
    }

    public static String findTxnID(String html){
        int index = html.indexOf("TXN");
        //System.out.println(index);
        String txnID = html.substring(index, index + 7);
        //System.out.println(txnID);
        return txnID;
    }
}
