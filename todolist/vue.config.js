module.exports = {
    devServer: {
        proxy: {
            '/data': {
                target: 'http://localhost:8090',
                ws: true,
                changeOrigin:true
            },
            '/delete': {
                target: 'http://localhost:8090',
                ws: true,
                changeOrigin: true
            },
            '/update': {
                target: 'http://localhost:8090',
                ws: true,
                changeOrigin: true
            },
            '/insertMonth': {
                target: 'http://localhost:8090',
                ws: true,
                changeOrigin: true
            },
        }
    }
}