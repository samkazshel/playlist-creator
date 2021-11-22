'use strict';

let playlistNamefield = document.querySelector("#playlistNameInput");
let create = document.querySelector("#createPlaylist");

let postdata = () => {
    let playlistNameValue = playlistNamefield.value;

    let newPlaylist = {
        playlistName: playlistNameValue
    }

    postFetch(newPlaylist);
}

let postFetch = (object) => {
    fetch('http://localhost:8080/playlist/create', {
        method: 'POST',
        headers: {
            "Content-type":"application/JSON"
        },
        body: JSON.stringify(object)
    })
        .then((response) => {
            if (response.status !== 201) {
            console.error(`Status: ${response.status}`);
            }
            response.json()
                .then((data) => {
                    console.log(data);
            })

    })
}

create.addEventListener('click', postdata);