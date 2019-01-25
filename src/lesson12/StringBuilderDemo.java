package lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
    StringBuilder str = createString(3,56);
        System.out.println(str);
        System.out.println(replaceSymbol(str,"="," равно "));
        System.out.println(replaceSymbol(str,"+"," плюс "));
        System.out.println(replaceSymbol(str,"-"," минус "));
        System.out.println(replaceSymbol(str,"*"," умножить "));



    }
    private static StringBuilder createString(int a,int b){
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(a).append("+").append(b).append("=").append(a+b).append('\n');
        stringBuilder.append(a).append("-").append(b).append("=").append(a-b).append('\n');
        stringBuilder.append(a).append("*").append(b).append("=").append(a*b).append('\n');
        return stringBuilder;
    }
    private static StringBuilder replaceSymbol(StringBuilder stringBuilder,String replaceSymbol, String replaceWith){
        int pos;
        while ((pos = stringBuilder.indexOf(replaceSymbol))!=-1){
//        stringBuilder.delete(pos,pos+replaceSymbol.length());
//        stringBuilder.insert(pos,replaceWith);}
            stringBuilder.replace(pos,pos+replaceSymbol.length(),replaceWith);}
        return stringBuilder;
    }

}
