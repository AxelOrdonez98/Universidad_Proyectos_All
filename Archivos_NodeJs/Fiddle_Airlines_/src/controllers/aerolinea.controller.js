const aerolineasCtrl = {}

aerolineasCtrl.renderaerolineaFormulario = (req, res) => {
    res.render('aerolinea/nueva-aerolinea')
}

aerolineasCtrl.crearNuevoaerolinea = (req, res) => {
    console.log(req.body)
    res.send('aerolinea nuevo')
}

aerolineasCtrl.renderaerolinea = (req, res) => {
    res.send('render aerolinea')
}

aerolineasCtrl.renderEditaraerolinea = (req, res) => {
    res.send('Editar aerolinea')
}

aerolineasCtrl.updateaerolinea = (req, res) => {
    res.send('update aerolinea')
}

aerolineasCtrl.eliminaraerolineas = (req, res) => {
    res.send('aerolinea eliminado')
}
module.exports = aerolineasCtrl