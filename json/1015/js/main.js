$(function(){
    $(".mgnb>ul>li>ul").click(function () {
        if ($(this).next('.mgnb').css('display') == 'none') {
            $(".mgnb").slideUp(300);
            $(this).next('.mgnb').slideDown(300);
        } else {
            $(this).next('.mgnb').slideUp(300);
        }
        return false;
    });
    $(".m-on").click(function(){
        if ($(this).next('.mgnb').css('right')== 0){
            
        }
    });
});