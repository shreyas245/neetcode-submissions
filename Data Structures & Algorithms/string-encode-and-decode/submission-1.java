class Solution {

    public String encode(List<String> strs) {
        String res = "";  

        for(String s: strs){
            res += s;
            res += "&;";
        }

        System.out.println(res);
        return res;
    }

    public List<String> decode(String str) {
        char[] charString = str.toCharArray();
        List<String> res = new ArrayList<>();

        StringBuilder string = new StringBuilder("");
        for(int i = 0; i < charString.length; i++){
            if(i + 1 < charString.length && charString[i] == '&' && charString[i+1] == ';'){
                res.add(string.toString());
                string = new StringBuilder();
                i++;
            }else{
            string.append(charString[i]);
            }
        }


        return res;
    }
}
