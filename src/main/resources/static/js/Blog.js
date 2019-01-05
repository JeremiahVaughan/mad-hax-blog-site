const articleBox = document.querySelectorAll(".article");

window.addEventListener("resize", changeArticleSize);

function changeArticleSize() {
    if(window.innerWidth < 1220) {
        for (let i = 0; i < articleBox.length; i++) {
            articleBox[i].style.cssFloat = "none";
            articleBox[i].style.display = "block";
            articleBox[i].style.width = "90%";
            articleBox[i].style.margin = "20 auto";
        }
    } else {
        for (let i = 0; i < articleBox.length; i++) {
            articleBox[i].style.cssFloat = "left";
            articleBox[i].style.display = "inline";
            articleBox[i].style.width = "25%";
            articleBox[i].style.margin = "30px";
        }
    }
}