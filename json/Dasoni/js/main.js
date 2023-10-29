$(function () {

    setTimeout(function () {
        $('.slider li .text0').addClass('on');
        $('.slider li .atext0').addClass('on');
    }, 1000);//1珥덊썑 理쒖큹 �쒕쾲留� �ㅽ뻾

    var bx = $('.slider').bxSlider({
        auto: true,
        controls: false,
        pager: false,
        mode: 'fade',
        pause: 5000,//�щ씪�대뱶 �ㅼ젣�띾룄 - setInterval怨� 鍮꾩듂
        autoHover: true,
        onSlideBefore: function () { },
        onSlideAfter: function () {
            var k = bx.getCurrentSlide();//�꾩옱�� �щ씪�대뱶 踰덊샇
            $('.slider li').find('h2').removeClass('on');
            $('.slider li').find('p').removeClass('on');
            $('.slider li .text' + k).addClass('on');
            $('.slider li .atext' + k).addClass('on');
        }
    });
    //#s2 諛묒뿉 �대떦
    var a1 = $('.s2_title img').offset().top;//   '/'
    var a2 = $('.s2_title h2').offset().top; // �쒕ぉ
    var a3 = $('.s2_title p').offset().top; // �댁슜
    var a4 = $('.s2_table li').offset().top; //�ш컖諛뺤뒪

    var a5 = $('.s3_title img').offset().top;//   '/'
    var a6 = $('.s3_title h2').offset().top; // �쒕ぉ
    var a7 = $('.s3_title p').offset().top; // �댁슜
    var a8 = $('.s3_table li').offset().top; //�ш컖諛뺤뒪

    var a9 = $('.s4_title img').offset().top;//   '/'
    var a10 = $('.s4_title h2').offset().top; // �쒕ぉ
    var a11 = $('.s4_title p').offset().top; // �댁슜
    var a12 = $('.s4_table li').offset().top; //�ш컖諛뺤뒪

    var b1 = $('#s5').offset().top;
    var b2 = $('#s6').offset().top;

    var f_box = $('.fix_box').offset().top;
    //#s3 諛묒뿉 �대떦

    console.log(a1, a2, a3, a4);

    $(window).scroll(function () {
        var sct = $(this).scrollTop();

        $('.fix_box').stop().animate({ top: sct + f_box }, 500);

        if (a1 < sct + 700) {
            $('.s2_title img').addClass('slide');
        }
        if (a2 < sct + 700) {
            $('.s2_title h2').addClass('slide');
        }
        if (a3 < sct + 700) {
            $('.s2_title p').addClass('slide');
        }
        if (a4 < sct + 700) {
            $('.s2_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s2_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s2_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s2_table li').eq(3).addClass('slide');
            }, 900);
        }

        if (a5 < sct + 700) {
            $('.s3_title img').addClass('slide');
        }
        if (a6 < sct + 700) {
            $('.s3_title h2').addClass('slide');
        }
        if (a7 < sct + 700) {
            $('.s3_title p').addClass('slide');
        }
        if (a8 < sct + 700) {
            $('.s3_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s3_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s3_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s3_table li').eq(3).addClass('slide');
            }, 900);
            setTimeout(function () {
                $('.s3_table li').eq(4).addClass('slide');
            }, 1200);
        }

        if (a9 < sct + 700) {
            $('.s4_title img').addClass('slide');
        }
        if (a10 < sct + 700) {
            $('.s4_title h2').addClass('slide');
        }
        if (a11 < sct + 700) {
            $('.s4_title p').addClass('slide');
        }
        if (a12 < sct + 700) {
            $('.s4_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s4_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s4_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s4_table li').eq(3).addClass('slide');
            }, 900);
        }

        if (b1 < sct + 700) {
            $('.s5_contents').addClass('slide1');
        }
        if (b2 < sct + 700) {
            $('.s6_noti, .s6_review').addClass('slide1');
        }

    });
    $('.popup1').draggable();


    if ($.cookie('popup1') == 'none') {
        $('.popup1').hide();
    }


    $('.btn2').click(function () {
        $('.popup1').fadeOut('fast');
    });

    $('.btn1').click(function () {
        $.cookie('popup1', 'none', { expires: 1 });
        $('.popup1').fadeOut('fast');
    });




});