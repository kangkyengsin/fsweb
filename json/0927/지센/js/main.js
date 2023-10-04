$(function () {
    var status;
    $(window).resize(function () {
        var w = $(this).width(); // 화면의 가로사이즈를 w에 대입

        if (w <= 850) {
            status = "mobile";
        } else {
            status = "pc";
            if ($('.mobile_nav').hasClass('active') == true) {
                $(".mobile_nav").removeClass("active");
                $(".mobile_nav .sub").hide();
                $(".transparency").removeClass("active");
                $(".container").removeClass("active");
            }
        }

    });
    
    $('.nav ul').hover(function(){
        $(this).addClass('over');
    },function(){
        $(this).removeClass('over');
    });

    $(".mobile_tab").click(function () {
        $(".mobile_nav").addClass("active");
        $(".transparency").addClass("active");
        $(".container").addClass("active");
    });
    $(".transparency").click(function () {
        $(".mobile_nav").removeClass("active");
        $(".mobile_nav .sub").hide();
        $(".transparency").removeClass("active");
        $(".container").removeClass("active");
    });
    $(".mobile_nav > ul > li > a").click(function () {
        if ($(this).next('.sub').css('display') == 'none') {
            $(".mobile_nav .sub").slideUp(300);
            $(this).next('.sub').slideDown(300);
        } else {
            $(this).next('.sub').slideUp(300);
        }
        return false;
    });
});