function getUsuarios(done) {
    const results = fetch("http://localhost:8080/api/invernadero/v1/user");

    results
        .then((response) => response.json())
        .then((data) => {
            console.log('API Data:', data);
            done(null, data);
        })
}

// Llamada a la función getUsuarios
getUsuarios((error, data) => {
    data.forEach(usuario => {
        const article = document.createRange().createContextualFragment(
            `<article class="article">
                <div class="article-content">
                    <h2>ID: ${usuario.id_user}</h2>
                    <h4>Nombre: ${usuario.name}</h4>
                    <h4>Apelido paterno: ${usuario.last_name}</h4>
                    <h4>Apellido materno: ${usuario.second_lastname}</h4>
                    <h4>tipo: ${usuario.type}</h4>
                </div>
            </article>`
        );  

        const main = document.querySelector(".Usuarios");
        main.append(article);
    });
});

////////////////////////////////////////////////////////////////

function getControl(done) {
    const results = fetch("http://localhost:8080/api/invernadero/v1/control");

    results
        .then((response) => response.json())
        .then((data) => {
            console.log('API Data:', data);
            done(null, data);
        })
}

// Llamada a la función getControl
getControl((error, data) => {
    data.forEach(reporte => {
        const article = document.createRange().createContextualFragment(
            `<article class="article">
                <div class="article-content">
                    <h2>ID: ${reporte.id_control}</h2>
                    <h4>fecha: ${reporte.date}</h4>
                    <h4>hora: ${reporte.time}</h4>
                    <h4>sensor_humedad: ${reporte.humidity}</h4>
                    <h4>sensor_temperatura: ${reporte.temperature}</h4>
                    <h4>ventilacion: ${reporte.ventilation}</h4>
                </div>
            </article>`
        );

        const main = document.querySelector(".Control");
        main.append(article);
    });
});


////////////////////////////////////////////////////////////////

function getReportes(done) {
    const results = fetch("http://localhost:8080/api/invernadero/v1/report");

    results
        .then((response) => response.json())
        .then((data) => {
            console.log('API Data:', data);
            done(null, data);
        })
}

// Llamada a la función getReportes
getReportes((error, data) => {
    data.forEach(reporte => {
        const article = document.createRange().createContextualFragment(
            `<article class="article">
                <div class="article-content">
                    <h2>ID: ${reporte.id_report}</h2>
                    <h4>fecha: ${reporte.date}</h4>
                    <h4>hora: ${reporte.time}</h4>
                    <h4>id_usuario: ${reporte.id_user}</h4>
                    <h4>nombre: ${reporte.name}</h4>
                    <h4>observaciones: ${reporte.reportations}</h4>
                </div>
            </article>`
        );

        const main = document.querySelector(".Reportes");
        main.append(article);
    });
});

////////////////////////////////////////////////////////////////

function getVerreportes(done) {
    const results = fetch("http://localhost:8080/api/invernadero/v1/viewreport");

    results
        .then((response) => response.json())
        .then((data) => {
            console.log('API Data:', data);
            done(null, data);
        })
}

// Llamada a la función getVerreportr
getVerreportes((error, data) => {
    data.forEach(reporte => {
        const article = document.createRange().createContextualFragment(
            `<article class="article">
                <div class="article-content">
                    <h2>ID: ${reporte.id_report}</h2>
                    <h4>fecha: ${reporte.date}</h4>
                    <h4>hora: ${reporte.time}</h4>
                    <h4>observaciones: ${reporte.reportations}</h4>
                </div>
            </article>`
        );

        const main = document.querySelector(".Verreporte");
        main.append(article);
    });
});

