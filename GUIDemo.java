<!DOCTYPE html>
<html class="scripts-not-loaded" lang="en">
<head>
  <meta charset="utf-8">
  <title>  GUIDemo.java: Rahman-ADVANCED PROGRAMMING
</title>
  <!--[if lte IE 9]> <meta http-equiv=refresh content="0; URL=/ie-9-is-not-supported.html" /> <![endif]-->
  <link rel="shortcut icon" type="image/x-icon" href="https://du11hjcvx0uqb.cloudfront.net/dist/images/favicon-e10d657a73.ico" />
  <link rel="apple-touch-icon" href="https://du11hjcvx0uqb.cloudfront.net/dist/images/apple-touch-icon-585e5d997d.png" />
  
  <link rel="stylesheet" media="all" href="https://du11hjcvx0uqb.cloudfront.net/dist/brandable_css/new_styles_normal_contrast/bundles/common-1536a16eec.css" />
  <script>
//<![CDATA[

!function(){
  var o,s,v;
  if (!(window.Promise && Object.assign && [].find && [].includes && (o={},s=Symbol(),v={},o[s]=v,o[s]===v) && (function f(){}).bind().name==='bound f')) {
    s = 's', document.write('<'+s+'cr'+'ipt src="https://du11hjcvx0uqb.cloudfront.net/dist/javascripts/vendor/ie11-polyfill-6afc9bbb51.js"></'+s+'c'+'ript>');
  }
}();
      
//]]>
</script>
  <script src="https://du11hjcvx0uqb.cloudfront.net/dist/javascripts/vendor/lato-fontfaceobserver-bddf7e337a.js" async="async"></script>
  
  <meta name="apple-itunes-app" content="app-id=480883488" />
<link rel="manifest" href="/web-app-manifest/manifest.json" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="theme-color" content="#008EE2">
  
  
  
  <script>
    // listen for any clicks on links that have href="#" or data-method set and queue them to be fired on dom ready.
    // note: the events targeted for a[data-method] elems don't get properly replayed, but
    // at least we can gobble them up here to prevent errors.
      function _earlyClick(e){
        var cur = e.target;
        while ( cur && cur.ownerDocument ) {
          if ( cur.getAttribute('href') === '#' || cur.getAttribute('data-method') ) {
            e.preventDefault();
            _earlyClick.clicks = _earlyClick.clicks || [];
            _earlyClick.clicks.push(cur);
            break;
          }
          cur = cur.parentNode;
        }
      }
      document.addEventListener('click', _earlyClick);
  </script>
</head>

<body class="with-left-side course-menu-expanded files primary-nav-expanded context-course_1464210">
<noscript>
  <div role="alert" class="ic-flash-static ic-flash-error">
    <div class="ic-flash__icon" aria-hidden="true">
      <i class="icon-warning"></i>
    </div>
    <h1>You need to have JavaScript enabled in order to access this site.</h1>
  </div>
</noscript>




<ul id="flash_message_holder"></ul>
<div id="flash_screenreader_holder"></div>

<div id="application" class="ic-app">
    <header id="header" class="ic-app-header no-print ">
    <a href="#content" id="skip_navigation_link">Skip To Content</a>
      <div role="region" class="ic-app-header__main-navigation" aria-label="Main Navigation">
        <div class="ic-app-header__logomark-container">
          <a href="https://canvas.jmu.edu/" class="ic-app-header__logomark">
            <span class="screenreader-only">Dashboard</span>
          </a>
        </div>
        <ul id="menu" class="ic-app-header__menu-list">
            <li class="menu-item ic-app-header__menu-list-item ">
              <a id="global_nav_profile_link" href="/profile" class="ic-app-header__menu-list-link">
                <div class="menu-item-icon-container" aria-hidden="true">
                  <div class="ic-avatar ">
                    <img src="https://canvas.jmu.edu/images/thumbnails/71541031/K25JNJiFbSKDi4ivyUGcBcDpSYW0D6GwuwSnu2sd" alt="Nicholas Duncan" />
                  </div>
                </div>
                <div class="menu-item__text">
                  Account
                </div>
              </a>
            </li>
          <li class="ic-app-header__menu-list-item ">
            <a id="global_nav_dashboard_link" href="https://canvas.jmu.edu/" class="ic-app-header__menu-list-link">
              <div class="menu-item-icon-container" aria-hidden="true">
                  <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--dashboard" version="1.1" x="0" y="0" viewBox="0 0 280 200" enable-background="new 0 0 280 200" xml:space="preserve"><path d="M231.6 94.2c-2.5-4.9-8.5-6.9-13.4-4.5l-57.3 28.6c-5.4-5.2-12.7-8.4-20.8-8.4 -16.6 0-30 13.5-30 30 0 16.6 13.5 30 30 30 16.6 0 30-13.5 30-30 0-1.3-0.1-2.5-0.2-3.8l57.3-28.6C232 105.2 234 99.2 231.6 94.2zM140 150c-5.5 0-10-4.5-10-10s4.5-10 10-10c5.5 0 10 4.5 10 10S145.6 150 140 150zM70 150H50c-5.5 0-10-4.5-10-10s4.5-10 10-10h20c5.5 0 10 4.5 10 10S75.5 150 70 150zM140 80c-5.5 0-10-4.5-10-10V50c0-5.5 4.5-10 10-10 5.5 0 10 4.5 10 10v20C150 75.5 145.5 80 140 80zM105 89.6c-3.5 0-6.8-1.8-8.7-5l-10-17.3c-2.8-4.8-1.1-10.9 3.7-13.7 4.8-2.8 10.9-1.1 13.7 3.7l10 17.3c2.8 4.8 1.1 10.9-3.7 13.7C108.4 89.1 106.7 89.6 105 89.6zM79.4 115.4c-1.7 0-3.4-0.4-5-1.3l-17.3-10c-4.8-2.8-6.4-8.9-3.7-13.7 2.8-4.8 8.9-6.4 13.7-3.7l17.3 10c4.8 2.8 6.4 8.9 3.7 13.7C86.2 113.6 82.8 115.4 79.4 115.4zM173.6 89.6c-1.7 0-3.4-0.4-5-1.3 -4.8-2.8-6.4-8.9-3.7-13.7l10-17.3c2.8-4.8 8.9-6.4 13.7-3.7 4.8 2.8 6.4 8.9 3.7 13.7l-10 17.3C180.4 87.8 177.1 89.6 173.6 89.6zM140 0C62.8 0 0 63 0 140.5V190c0 5.5 4.5 10 10 10h260c5.5 0 10-4.5 10-10v-49.5C280 63 217.2 0 140 0zM260 180H20v-39.5C20 74.1 73.8 20 140 20c66.2 0 120 54.1 120 120.5V180zM230 150h-20c-5.5 0-10-4.5-10-10s4.5-10 10-10h20c5.5 0 10 4.5 10 10S235.5 150 230 150z"/></svg>
              </div>
              <div class="menu-item__text">Dashboard</div>
            </a>
          </li>
          <li class="menu-item ic-app-header__menu-list-item ic-app-header__menu-list-item--active">
            <a id="global_nav_courses_link" href="/courses" class="ic-app-header__menu-list-link">
              <div class="menu-item-icon-container" aria-hidden="true">
                <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--courses" version="1.1" x="0" y="0" viewBox="0 0 280 259" enable-background="new 0 0 280 259" xml:space="preserve"><path d="M226.2 259H32.3c-5.9 0-10.8-4.8-10.8-10.8v-43.5H10.8C4.8 204.8 0 199.9 0 194c0-6 4.8-10.8 10.8-10.8h10.8v-21.6H10.8c-5.9 0-10.8-4.8-10.8-10.8s4.8-10.8 10.8-10.8h10.8v-21.6H10.8c-5.9 0-10.8-4.8-10.8-10.8 0-6 4.8-10.8 10.8-10.8h10.8V75.4H10.8C4.8 75.4 0 70.6 0 64.7s4.8-10.8 10.8-10.8h10.8V10.8c0-6 4.8-10.8 10.8-10.8h193.9c5.9 0 10.8 4.8 10.8 10.8v21.6h32.3c5.9 0 10.8 4.8 10.8 10.8v172.4c0 6-4.8 10.8-10.8 10.8H237v21.9C237 254.2 232.2 259 226.2 259zM43.1 237.4h172.4V21.6H43.1v32.3h10.7c5.9 0 10.8 4.8 10.8 10.8s-4.8 10.8-10.8 10.8H43.1V97h10.7c5.9 0 10.8 4.8 10.8 10.8 0 6-4.8 10.8-10.8 10.8H43.1v21.6h10.7c5.9 0 10.8 4.8 10.8 10.8s-4.8 10.8-10.8 10.8H43.1v21.6h10.7c5.9 0 10.8 4.8 10.8 10.8 0 6-4.8 10.8-10.8 10.8H43.1V237.4zM237 204.8h21.5v-21.6H237V204.8zM237 161.7h21.5v-21.6H237V161.7zM237 118.5h21.5V97H237V118.5zM237 75.4h21.5V53.9H237V75.4zM172.2 129.3H96.9c-5.9 0-10.8-4.8-10.8-10.8V64.7c0-6 4.8-10.8 10.8-10.8h75.3c5.9 0 10.8 4.8 10.8 10.8v53.9C183 124.5 178.2 129.3 172.2 129.3zM107.7 107.8h53.8V75.4h-53.8V107.8z"/></svg>
              </div>
              <div class="menu-item__text">
                Courses
              </div>
            </a>
          </li>
            <li class="menu-item ic-app-header__menu-list-item ">
              <a id="global_nav_groups_link" href="/groups" class="ic-app-header__menu-list-link">
                <div class="menu-item-icon-container" aria-hidden="true">
                  <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--groups" viewBox="0 0 200 135"><path d="M134.5 129.4c0-1.1 0-19.8-6.2-31.1-4.5-8.5-16.4-12.4-35-19.2-1.7-.6-3.4-1.1-5.1-1.7v-8.5c5.6-5.1 8.5-12.4 8.5-20.3V29.4C96.6 13 83.6 0 67.2 0S37.9 13 37.9 29.4v19.2c0 7.3 3.4 14.7 8.5 20.3v8.5c-1.7.6-3.4 1.1-5.1 1.7-18.6 6.2-30.5 10.7-35 19.2C0 109.6 0 128.8 0 129.4c0 3.4 2.3 5.6 5.6 5.6h123.7c3.5 0 5.7-2.3 5.2-5.6zm-123.2-5.7c.6-5.6 1.7-14.7 3.4-19.8C17 98.8 30 94.3 43.5 89.8c2.8-1.1 5.6-2.3 9-3.4 2.3-.6 4-2.8 4-5.1V66.7c0-1.7-.6-3.4-1.7-4.5-4-3.4-6.2-8.5-6.2-13.6V29.4c0-10.2 7.9-18.1 18.1-18.1s18.1 7.9 18.1 18.1v19.2c0 5.1-2.3 10.2-6.2 13.6-1.1 1.1-1.7 2.8-1.7 4.5v14.7c0 2.3 1.7 4.5 4 5.1 2.8 1.1 6.2 2.3 9 3.4 13.6 5.1 26.6 9.6 28.8 14.1 2.8 5.1 4 13.6 4.5 19.8H11.3zM196 79.1c-2.8-6.2-11.3-9.6-22.6-13.6l-1.7-.6v-3.4c4.5-4 6.8-9.6 6.8-15.8V35c0-12.4-9.6-22-22-22s-22 10.2-22 22v10.7c0 6.2 2.3 11.9 6.8 15.8V65l-1.7.6c-7.3 2.8-13 4.5-16.9 7.3-1.7 1.1-2.3 2.8-2.3 5.1.6 1.7 1.7 3.4 3.4 4.5 7.9 4 12.4 7.3 14.1 10.7 2.3 4.5 4 10.2 5.1 18.1.6 2.3 2.8 4.5 5.6 4.5h45.8c3.4 0 5.6-2.8 5.6-5.1 0-3.9 0-24.3-4-31.6zm-42.9 25.4c-1.1-6.8-2.8-12.4-5.1-16.9-1.7-4-5.1-6.8-9.6-10.2 1.7-1.1 3.4-1.7 5.1-2.3l5.6-2.3c1.7-.6 3.4-2.8 3.4-5.1v-9.6c0-1.7-.6-3.4-2.3-4.5-2.8-1.7-4.5-5.1-4.5-8.5V34.5c0-6.2 4.5-10.7 10.7-10.7s10.7 5.1 10.7 10.7v10.7c0 3.4-1.7 6.2-4.5 8.5-1.1 1.1-2.3 2.8-2.3 4.5v10.2c0 2.3 1.1 4.5 3.4 5.1l5.6 2.3c6.8 2.3 15.3 5.6 16.4 7.9 1.7 2.8 2.8 12.4 2.8 20.9h-35.4z"/></svg>

                </div>
                <div class="menu-item__text">
                  Groups
                </div>
              </a>
            </li>
          <li class="menu-item ic-app-header__menu-list-item ">
            <a id="global_nav_calendar_link" href="/calendar" class="ic-app-header__menu-list-link">
              <div class="menu-item-icon-container" aria-hidden="true">
                <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--calendar" version="1.1" x="0" y="0" viewBox="0 0 280 280" enable-background="new 0 0 280 280" xml:space="preserve"><path d="M268.3 280H11.7C5.2 280 0 274.8 0 268.3V35c0-6.4 5.2-11.7 11.7-11.7h35V11.7C46.7 5.2 51.9 0 58.3 0h35C99.8 0 105 5.2 105 11.7v11.7h70V11.7C175 5.2 180.2 0 186.7 0h35c6.4 0 11.7 5.2 11.7 11.7v11.7h35c6.4 0 11.7 5.2 11.7 11.7v233.3C280 274.8 274.8 280 268.3 280zM23.3 256.7h233.3v-210h-23.3v11.7c0 6.4-5.2 11.7-11.7 11.7h-35c-6.4 0-11.7-5.2-11.7-11.7V46.7h-70v11.7c0 6.4-5.2 11.7-11.7 11.7h-35c-6.4 0-11.7-5.2-11.7-11.7V46.7H23.3V256.7zM198.3 46.7H210V23.3h-11.7V46.7zM70 46.7h11.7V23.3H70V46.7zM198.3 245c-6.4 0-11.7-5.2-11.7-11.7v-11.7h-35v11.7c0 6.4-5.2 11.7-11.7 11.7 -6.4 0-11.7-5.2-11.7-11.7v-11.7h-35v11.7c0 6.4-5.2 11.7-11.7 11.7S70 239.8 70 233.3v-11.7H46.7c-6.4 0-11.7-5.2-11.7-11.7s5.2-11.7 11.7-11.7H70V175H46.7c-6.4 0-11.7-5.2-11.7-11.7 0-6.4 5.2-11.7 11.7-11.7H70v-23.3H46.7c-6.4 0-11.7-5.2-11.7-11.7S40.2 105 46.7 105H70V93.3c0-6.4 5.2-11.7 11.7-11.7s11.7 5.2 11.7 11.7V105h35V93.3c0-6.4 5.2-11.7 11.7-11.7 6.4 0 11.7 5.2 11.7 11.7V105h35V93.3c0-6.4 5.2-11.7 11.7-11.7 6.4 0 11.7 5.2 11.7 11.7V105h23.3c6.4 0 11.7 5.2 11.7 11.7s-5.2 11.7-11.7 11.7H210v23.3h23.3c6.4 0 11.7 5.2 11.7 11.7 0 6.4-5.2 11.7-11.7 11.7H210v23.3h23.3c6.4 0 11.7 5.2 11.7 11.7s-5.2 11.7-11.7 11.7H210v11.7C210 239.8 204.8 245 198.3 245zM151.7 198.3h35V175h-35V198.3zM93.3 198.3h35V175h-35V198.3zM151.7 151.7h35v-23.3h-35V151.7zM93.3 151.7h35v-23.3h-35V151.7z"/></svg>
              </div>
              <div class="menu-item__text">
                Calendar
              </div>
            </a>
          </li>
          <li class="menu-item ic-app-header__menu-list-item ">
            <a id="global_nav_conversations_link" href="/conversations" class="ic-app-header__menu-list-link">
              <div class="menu-item-icon-container" aria-hidden="true">
                <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--inbox" version="1.1" x="0" y="0" viewBox="0 0 280 280" enable-background="new 0 0 280 280" xml:space="preserve"><path d="M93.3 105c0-6.4 5.2-11.7 11.7-11.7h70c6.4 0 11.7 5.2 11.7 11.7s-5.2 11.7-11.7 11.7h-70C98.6 116.7 93.3 111.4 93.3 105zM105 70h23.3c6.4 0 11.7-5.2 11.7-11.7s-5.2-11.7-11.7-11.7H105c-6.4 0-11.7 5.2-11.7 11.7S98.6 70 105 70zM280 198.3v70c0 6.4-5.2 11.7-11.7 11.7H11.7C5.2 280 0 274.8 0 268.3v-69.8c0-1.1 0.1-2.2 0.4-3.3 0.3-1.1 0.8-2.1 1.3-3L36.7 134c2.1-3.5 5.9-5.7 10-5.7h11.7V11.7C58.3 5.2 63.6 0 70 0h140c6.4 0 11.7 5.2 11.7 11.7v116.7h11.7c4.1 0 7.9 2.1 10 5.7l35 58.3c0.1 0.2 0.1 0.5 0.3 0.7 0.4 0.7 0.6 1.4 0.8 2.2 0.2 0.8 0.4 1.5 0.5 2.3C279.9 197.8 280 198.1 280 198.3zM32.3 186.7h67.9c6.4 0 11.7 5.2 11.7 11.7V210c0 7.8 3.5 7.8 6 7.8h48.7c5.7 0 10.5-3.6 10.5-7.8v-11.7c0-6.4 5.2-11.7 11.7-11.7h59l-21-35h-5.1v11.7c0 6.4-5.2 11.7-11.7 11.7s-11.7-5.2-11.7-11.7v-140H81.7v140c0 6.4-5.2 11.7-11.7 11.7s-11.7-5.2-11.7-11.7v-11.7h-5.1L32.3 186.7zM256.7 210h-56.3c0 17.2-15.2 31.1-33.8 31.1h-48.7c-17.6 0-29.4-12.5-29.4-31.1H23.3v46.7h233.3V210zM175 163.3c6.4 0 11.7-5.2 11.7-11.7 0-6.4-5.2-11.7-11.7-11.7h-70c-6.4 0-11.7 5.2-11.7 11.7 0 6.4 5.2 11.7 11.7 11.7H175z"/></svg>
                <span class="menu-item__badge" style="display: none">0</span>
              </div>
              <div class="menu-item__text">
                Inbox
              </div>
            </a>
          </li>
            

          <li class="ic-app-header__menu-list-item">
           <a id="global_nav_help_link" class="ic-app-header__menu-list-link" data-track-category="help system" data-track-label="help button" href="http://help.instructure.com/">
              <div class="menu-item-icon-container" role="presentation">
                <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg menu-item__icon svg-icon-help" version="1.1" x="0" y="0" viewBox="0 0 200 200" enable-background="new 0 0 200 200" xml:space="preserve" fill="currentColor"><path d="M100 200C44.9 200 0 155.1 0 100 0 44.9 44.9 0 100 0s100 44.9 100 100C200 155.1 155.1 200 100 200zM100 20c-44.1 0-80 35.9-80 80s35.9 80 80 80 80-35.9 80-80S144.1 20 100 20z"/><path d="M110 130H90v-30h10c11 0 20-9 20-20 0-11-9-20-20-20s-20 9-20 20H60c0-22.1 17.9-40 40-40s40 17.9 40 40c0 18.6-12.8 34.3-30 38.7V130z"/><circle cx="100" cy="150" r="12.5"/></svg>

              </div>
              <div class="menu-item__text">
                Help
              </div>
</a>          </li>
        </ul>
      </div>
      <div role="region" aria-label="Secondary Navigation" class="ic-app-header__secondary-navigation">
        <ul class="ic-app-header__menu-list">
          <li class="menu-item ic-app-header__menu-list-item">
            <span aria-live="polite">
              <button
                id="primaryNavToggle"
                class="ic-app-header__menu-list-link ic-app-header__menu-list-link--nav-toggle"
                aria-label="
                  Minimize global navigation"
                title="
                  Minimize global navigation"
              >
                <svg xmlns="http://www.w3.org/2000/svg" class="ic-icon-svg ic-icon-svg--navtoggle" version="1.1" x="0" y="0" width="40" height="32" viewBox="0 0 40 32" xml:space="preserve">
  <polygon points="20.6 9.4 23.4 6.6 32.8 16 23.4 25.4 20.6 22.6 25.2 18 0 18 0 14 25.2 14 "/><rect x="36" width="4" height="32"/>
</svg>

              </button>
            </span>
          </li>
        </ul>
      </div>
    <div id="global_nav_tray_container"></div>
  </header>


  <div id="instructure_ajax_error_box">
    <div style="text-align: right; background-color: #fff;"><a href="#" class="close_instructure_ajax_error_box_link">Close</a></div>
    <iframe id="instructure_ajax_error_result" src="about:blank" style="border: 0;" title="Error"></iframe>
  </div>

  

  <div id="wrapper" class="ic-Layout-wrapper">
      <div class="ic-app-nav-toggle-and-crumbs no-print">
          <button type="button" id="courseMenuToggle" class="Button Button--link Button--small ic-app-course-nav-toggle" aria-live="polite" aria-label="Hide Courses Navigation Menu" title="Hide Courses Navigation Menu">
            <i class="icon-hamburger" aria-hidden="true"></i>
          </button>
          <div class="ic-app-crumbs">
        <nav id="breadcrumbs" role="navigation" aria-label="breadcrumbs"><ul><li class="home"><a href="/"><span class="ellipsible">      <i class="icon-home"
         title="My Dashboard">
        <span class="screenreader-only">My Dashboard</span>
      </i>
</span></a></li><li><a href="/courses/1464210"><span class="ellipsible">CS159_0001_SP17</span></a></li><li><a href="/courses/1464210/files"><span class="ellipsible">Files</span></a></li><li><a href="/courses/1464210/files/76729106"><span class="ellipsible">GUIDemo.java</span></a></li></ul></nav>
        </div>
      </div>
    <div id="main" class="ic-Layout-columns">
        <div id="left-side"
          class="ic-app-course-menu list-view"
          style="display: block"
          >
              <span id="section-tabs-header-subtitle" class="ellipsis">Spring Semester 2017</span>
            <nav role="navigation" aria-label="context"><ul id="section-tabs"><li class="section"><a href="/courses/1464210" title="Home" class="home">Home</a></li><li class="section"><a href="/courses/1464210/announcements" title="Announcements" class="announcements" aria-label="Course Announcements">Announcements</a></li><li class="section"><a href="/courses/1464210/assignments" title="Assignments" class="assignments" aria-label="Course Assignments">Assignments</a></li><li class="section"><a href="/courses/1464210/discussion_topics" title="Discussions" class="discussions" aria-label="Course Discussions">Discussions</a></li><li class="section"><a href="/courses/1464210/grades" title="Grades" class="grades" aria-label="Course Grades">Grades</a></li><li class="section"><a href="/courses/1464210/users" title="People" class="people">People</a></li><li class="section"><a href="/courses/1464210/assignments/syllabus" title="Syllabus" class="syllabus">Syllabus</a></li><li class="section"><a href="/courses/1464210/quizzes" title="Quizzes" class="quizzes">Quizzes</a></li><li class="section"><a href="/courses/1464210/conferences" title="Conferences" class="conferences">Conferences</a></li><li class="section"><a href="/courses/1464210/modules" title="Modules" class="modules">Modules</a></li><li class="section"><a href="/courses/1464210/external_tools/61657" title="Piazza" class="context_external_tool_61657">Piazza</a></li></ul></nav>
        </div>
      <div id="not_right_side" class="ic-app-main-content">
        <div id="content-wrapper" class="ic-Layout-contentWrapper">
            
          <div id="content" class="ic-Layout-contentMain" role="main">
              <h2>GUIDemo.java</h2>
  <div>
    <span style="font-size: 1.2em;">
      <a href="/courses/1464210/files/76729106/download?download_frd=1">Download GUIDemo.java</a>
    </span> (1.24 KB)
  </div>
    <div id="doc_preview" data-canvadoc_session_url="/api/v1/canvadoc_session?blob=%7B%22user_id%22:190000005177078,%22attachment_id%22:76729106,%22type%22:%22canvadoc%22%7D&amp;hmac=ffa1ce0c28332bb3616d467bec28b7c60ee2bf9a" data-attachment_id="76729106" data-mimetype="text/x-java" data-attachment_view_inline_ping_url="https://canvas.jmu.edu/courses/1464210/files/76729106/inline_view" data-attachment_preview_processing="true"></div>
  <div id="sequence_footer" data-course-id="1464210" data-asset-id="76729106" data-asset-type="File"></div>



          </div>
        </div>
        <div id="right-side-wrapper" class="ic-app-main-content__secondary">
          <aside id="right-side" role="complementary">
            
          </aside>
        </div>
      </div>
    </div>
  </div>



    <div style="display:none;"><!-- Everything inside of this should always stay hidden -->
        <div id="page_view_id">ef33e802-f3e9-4dc4-867a-cb05b44f672f</div>
    </div>
    <div id="cant_record_dialog" style="display: none;">
  <div>
    In order to create video or audio recordings your computer needs to be 
    webcam-enabled.  If you don&#39;t have a webcam on your computer, you can still
    record audio-only messages by first installing the Google Video Chat
    plugin.
  </div>
  <div style="text-align: center; font-size: 1.5em; margin: 10px;">
    <a href="http://www.google.com/chat/video" target="_blank" class="btn">Install the Video Plugin</a>
  </div>
  <div class="links" style="text-align: right; font-size: 0.8em; display: none;">
    <a href="#" class="cant_record_link">Don&#39;t have a webcam?</a>
  </div>
</div>
  <div id='aria_alerts' class='hide-text affix' role="alert" aria-live="assertive"></div>
  <div id='StudentContextTray__Container'></div>
  <script src="https://du11hjcvx0uqb.cloudfront.net/dist/brandable_css/default/variables-62f4f39cd5fddbef6893d650fc51b77f.js"></script>
<script>
  INST = {"environment":"production","allowMediaComments":true,"kalturaSettings":{"domain":"nv.instructuremedia.com","resource_domain":"nv.instructuremedia.com","rtmp_domain":"fms-prod.instructuremedia.com","partner_id":"9","subpartner_id":"0","player_ui_conf":"0","kcw_ui_conf":"0","upload_ui_conf":"0","max_file_size_bytes":534773760,"do_analytics":false,"hide_rte_button":false,"js_uploader":true},"googleAnalyticsAccount":"UA-9138420-1","disableScribdPreviews":true,"logPageViews":true,"maxVisibleEditorButtons":3,"editorButtons":[]};
  ENV = {"ASSET_HOST":"https:\/\/du11hjcvx0uqb.cloudfront.net","active_brand_config":null,"active_brand_config_json_url":"https:\/\/du11hjcvx0uqb.cloudfront.net\/dist\/brandable_css\/default\/variables-62f4f39cd5fddbef6893d650fc51b77f.json","url_to_what_gets_loaded_inside_the_tinymce_editor_css":"https:\/\/du11hjcvx0uqb.cloudfront.net\/dist\/brandable_css\/new_styles_normal_contrast\/bundles\/what_gets_loaded_inside_the_tinymce_editor-da765ef8c0.css","current_user_id":"5177078","current_user":{"id":"5177078","display_name":"Nicholas Duncan","avatar_image_url":"https:\/\/canvas.jmu.edu\/images\/thumbnails\/71541031\/K25JNJiFbSKDi4ivyUGcBcDpSYW0D6GwuwSnu2sd","html_url":"https:\/\/canvas.jmu.edu\/about\/5177078"},"current_user_roles":["user","student"],"current_user_disabled_inbox":false,"files_domain":"cluster19-files.instructure.com","DOMAIN_ROOT_ACCOUNT_ID":190000000081707,"k12":false,"help_link_name":"Help","help_link_icon":"help","use_high_contrast":false,"SETTINGS":{"open_registration":false,"eportfolios_enabled":true,"collapse_global_nav":false,"show_feedback_link":true,"enable_profiles":true},"page_view_update_url":"\/page_views\/ef33e802-f3e9-4dc4-867a-cb05b44f672f?page_view_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpIjoiZWYzM2U4MDItZjNlOS00ZGM0LTg2N2EtY2IwNWI0NGY2NzJmIiwidSI6MTkwMDAwMDA1MTc3MDc4LCJjIjoiMjAxNy0wNC0xM1QxNDozMjozMi4zNFoifQ.bZQGRjBsEkofkoJHirG2Zxq0AIkDNxhoaJZYeu9B-1w","context_asset_string":"course_1464210","ping_url":"https:\/\/canvas.jmu.edu\/api\/v1\/courses\/1464210\/ping","TIMEZONE":"America\/New_York","CONTEXT_TIMEZONE":"America\/New_York","LOCALE":"en","BIGEASY_LOCALE":"en_US","FULLCALENDAR_LOCALE":"en","MOMENT_LOCALE":"en","badge_counts":{"submissions":0},"notices":[]};

</script>


<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/vendor.bundle-13d8c81330.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/javascripts/vendor/timezone/America/New_York-2ece7ac506.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/javascripts/vendor/timezone/en_US-f395725400.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/appBootstrap.bundle-785096b05d.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/common.bundle-1438cfa0dd.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/module_sequence_footer.bundle-dccfdf6130.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/file_show.bundle-a9a99dce23.js"></script>
<script src="https://du11hjcvx0uqb.cloudfront.net/dist/webpack-production/navigation_header.bundle-99ab348354.js"></script>




  <script>
    var className = document.documentElement.className;
    document.documentElement.className = className.replace(/scripts-not-loaded/, '');
  </script>


</div> <!-- #application -->
</body>
</html>
