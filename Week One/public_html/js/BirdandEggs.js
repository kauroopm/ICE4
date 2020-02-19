/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var eggsX = new Array();
var eggsY = new Array();
var eggImage = new Image();
var birdImage = new Image();
var birdSound = new Audio();
window.onload = init;
function init(){
    birdImage.src = "../Pictures/bird.png";
    eggImage.src = "../Pictures/egg.png";
    birdSound.src = "../Sound/squeeze-toy.mp3";
    birdSound.oncanplaythrough;
    document.getElementById("container").onmousemove = drawBirdandEggs;
    document.getElementById("container").onclick = layEgg;
}
function drawBirdandEggs(event){
    var canvas = event.target;
    var context = canvas.getContext("2d");
    context.clearRect(0, 0, canvas.width, canvas.height);
    for(var i = 0; i < eggsX.length ; i++){
        context.drawImage(eggImage, eggsX[i], eggsY[i]);
    }
    var x = event.pageX - canvas.offsetLeft - 2;
    var y = event.pageY - canvas.offsetTop - 2;
    context.drawImage(birdImage, x, y);
}
function layEgg(event){
    var canvas = event.target;
    var x = event.pageX - canvas.offsetLeft - 2;
    var y = event.pageY - canvas.offsetTop - 2;
    eggsX[eggsX.length] = x + birdImage.width/2 - 30;
    eggsY[eggsY.length] = y + birdImage.height - 30;
    birdSound.load();
    birdSound.play();
    drawBirdandEggs(event);
}

