function main() {
    var depth = parseInt(readLine(), 10);
    //your code goes here
    let feet = 0,
        days = 0;
    
    while (feet < depth) {
        days++;
        feet += 7;
        
        if (feet >= depth) {
            console.log(days);
            break;
        }
        
        feet -= 2;
    }
}