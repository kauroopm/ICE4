/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



function createSubtractFunction() {
    //.....
    function subtract(a, b) {
        let ans = a - b;
        document.writeln(a + " - " + b + " = " + ans);

    }
    return subtract;
}
let sub = createSubtractFunction();
sub(5, 3);


