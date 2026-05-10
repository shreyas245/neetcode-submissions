class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let map = new Map();
        map.set("}","{");
        map.set(")","(");
        map.set("]","[");
        // console.log(map);

        let stack = [];
        for(let i = 0;i < s.length;i++){
            if(map.has(s[i])){
                if(stack.length > 0 && stack[stack.length - 1] == map.get(s[i]) ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }else{
                stack.push(s[i]);
            }
        }
        return stack.length === 0;

    }
}