class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" +");
        // StringBuilder sb = new StringBuilder();
        String ns = " ";
        for(int i = words.length - 1; i >= 0; i--){
            // sb.append(words[i]);
            // sb.append(" ");
            ns += words[i];
            ns += " ";
        }
        return ns.trim();                       //sb.toString().trim();
    }
}