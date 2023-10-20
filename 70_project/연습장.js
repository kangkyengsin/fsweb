// set 3d transforms
TweenMax.set("#clock", { perspective: 1500 });
TweenMax.set(".upper", { rotationX: 0.01, transformOrigin: "50% 100%" });
TweenMax.set(".lower", { rotationX: 0.01, transformOrigin: "50% 0%" });

// set clock
var t, ss, mm, hh;
setTimeVars();
function setTimeVars() {
    t = new Date();
    t = new Date();
    ss = String(t.getSeconds());
    mm = String(t.getMinutes());
    hh = String(t.getHours());
    if (ss.length == 1) ss = "0" + ss;
    if (mm.length == 1) mm = "0" + mm;
    if (hh.length == 1) hh = "0" + hh;
}

hh2.childNodes[3].innerHTML = hh2.childNodes[7].innerHTML =
    "<span>" + Number(hh.substr(0, 1)) + "</span>";
hh1.childNodes[3].innerHTML = hh1.childNodes[7].innerHTML =
    "<span>" + Number(String(hh).substr(1, 1)) + "</span>";

mm2.childNodes[3].innerHTML = mm2.childNodes[7].innerHTML =
    "<span>" + Number(mm.substr(0, 1)) + "</span>";
mm1.childNodes[3].innerHTML = mm1.childNodes[7].innerHTML =
    "<span>" + Number(mm.substr(1, 1)) + "</span>";

ss2.childNodes[3].innerHTML = ss2.childNodes[7].innerHTML =
    "<span>" + Number(ss.substr(0, 1)) + "</span>";
ss1.childNodes[3].innerHTML = ss1.childNodes[7].innerHTML =
    "<span>" + Number(ss.substr(1, 1)) + "</span>";

// start ticking
var interval = setInterval(function () {
    setTimeVars();

    tick(ss1, Number(ss.substr(1, 1)));

    if (ss.substr(1, 1) == "9") {
        tick(ss2, Number(ss.substr(0, 1)));
        if (ss == "59") {
            tick(ss2, 5, true);
            tick(mm1, Number(mm.substr(1, 1)));
            if (mm.substr(1, 1) == "9") {
                tick(mm2, Number(mm.substr(0, 1)));
                if (mm == "59") {
                    tick(mm2, 5, true);
                    tick(hh1, Number(hh.substr(1, 1)));
                    if (hh.substr(1, 1) == "9") tick(hh2, Number(hh.substr(0, 1)));
                    if (hh == "12") {
                        tick(hh1, Number(hh.substr(0, 1)), true);
                        tick(hh2, Number(hh.substr(1, 1)), true);
                    }
                }
            }
        }
    }
}, 1000);

function tick(mc, i, toZero = false) {
    // set numbers
    mc.childNodes[3].innerHTML = "<span>" + i + "</span>"; //start upper
    mc.childNodes[5].innerHTML = "<span>" + i + "</span>"; //start lower
    if (i == 9 || toZero) i = -1;
    mc.childNodes[1].innerHTML = "<span>" + (i + 1) + "</span>"; //end upper
    mc.childNodes[7].innerHTML = "<span>" + (i + 1) + "</span>"; //end lower
    // animate tick
    TweenMax.fromTo(
        mc.childNodes[1],
        0.3,
        { alpha: 0 },
        { alpha: 1, ease: Power4.easeIn }
    );
    TweenMax.fromTo(
        mc.childNodes[3],
        0.3,
        {
            rotationX: 0,
            background:
                "linear-gradient(0deg, rgba(200,200,200,1), rgba(255,255,255,1) 15%)"
        },
        {
            rotationX: -90,
            ease: Power1.easeIn
        }
    );
    TweenMax.fromTo(
        mc.childNodes[7],
        0.5 + 0.2 * Math.random(),
        { rotationX: 90 },
        { rotationX: 0, ease: Bounce.easeOut, delay: 0.3 }
    );
    TweenMax.fromTo(
        mc.childNodes[5],
        0.6,
        { alpha: 1 },
        { alpha: 0, ease: Bounce.easeOut, delay: 0.3 }
    );
}
