class Solution {
    /**
     * @param {string[]} str
     * @returns {string}
     */
    encode(str) {
           let newStr = "";

    for(let i = 0;i<str.length;i++){
        let prefix = str[i].length + "#";
        newStr = newStr + prefix + str[i];
    }
    return newStr

        
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
            let result = []
            let i = 0
            while(i<str.length){
                let curr = ""
                while(str[i] != "#"){
                    curr += str[i];
                    i++;
                }
                let size = parseInt(curr);
                i++;
                result.push(str.substr(i,size));
                i += size;   

            }
            console.log(result)
            return result;
    }
}
