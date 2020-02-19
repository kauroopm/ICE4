/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var radius = 50;
var xCenter = 0;
var yCenter = 200;
var timerId;
function startMoving() {
    timerId = setInterval(MovingBall, 16);
}
function stopMoving() {
    clearTimeout(timerId);
}
function MovingBall() {
    xCenter += 10;
    var e = document.getElementById("MovingBall");
    e.style.left = xCenter + "px";
    if (xCenter >= window.innerWidth - radius * 2) {
        stopMoving();
    }
}
startMoving();                             