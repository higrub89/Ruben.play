// Player functionality for Ruben.play multimedia page

document.addEventListener('DOMContentLoaded', function() {
    const videos = document.querySelectorAll('video');
    
    videos.forEach(video => {
        // Add custom controls behavior
        video.addEventListener('play', function() {
            console.log('Video playing:', this.src);
        });
        
        video.addEventListener('pause', function() {
            console.log('Video paused:', this.src);
        });
        
        // Stop other videos when one starts playing
        video.addEventListener('play', function() {
            videos.forEach(otherVideo => {
                if (otherVideo !== video && !otherVideo.paused) {
                    otherVideo.pause();
                }
            });
        });
    });
    
    console.log('Ruben.play multimedia player initialized');
});
