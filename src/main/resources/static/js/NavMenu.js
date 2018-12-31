const navMenu = document.querySelector("#navMenu");
const openBtn = document.querySelector("#openBtn");
const closeBtn = document.querySelector(".closebtn");
const container = document.querySelector("#container");

openBtn.addEventListener("click", openNav);
closeBtn.addEventListener("click", closeNav);

let menuOpen = false;

function openNav() {
    if (menuOpen) {
        closeNav();
        menuOpen = false;
    } else {
        if (window.innerWidth > 1440) {
            navMenu.style.width = "20%";
            container.style.marginLeft = "20%";
        } else {
            navMenu.style.width = "50%";
            container.style.marginLeft = "50%";
        }
        menuOpen = true
    }
}

function closeNav() {
    navMenu.style.width = "0";
    container.style.marginLeft = "0";
    menuOpen = false;
}