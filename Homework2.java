void main(){
    String [] id = {"1","2","3","4"};
    String [] name = {"Kasun", "Nuwan", "Ruwan", "Supun"};
    String [] contact1 = {"077-1234567", "078-1234567", "078-1234567", "041-123456"};
    String [] contact2 = {"011-1234567", "-", null, "033-123456"};
    final String [][] CUSTOMER = {id,name,contact1,contact2};

    final String LINE = STR."+\{"-".repeat(6)}+\{"-".repeat(10)}+\{"-".repeat(15)}+\{"-".repeat(15)}+";
    final String RAW = "|%-6s|%-10s|%-15s|%-15s|\n";
    System.out.println(LINE);
    System.out.printf(RAW,"ID","Name","Contact 1","Contact 2");
    System.out.println(LINE);

    for (int i = 0; i < CUSTOMER.length; i++) {
      String custId = CUSTOMER[0][i];
      String custName = CUSTOMER[1][i];
      String custContact1 = CUSTOMER[2][i];
      String custContact2 = CUSTOMER[3][i];

        System.out.printf(RAW,getCustId(custId),custName,getContact(custContact1),getContact(custContact2));
    }

    System.out.println(LINE);

}

String getCustId(String id){
    return "S-%03d".formatted( Integer.parseInt(id));
}

String getContact(String contact){
    if(contact==null) return null;
    else if (contact.equals("-")) return "-";
    else return contact;
}

